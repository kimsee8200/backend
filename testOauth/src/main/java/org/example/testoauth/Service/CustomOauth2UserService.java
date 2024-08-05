package org.example.testoauth.Service;

import jakarta.security.auth.message.AuthException;
import lombok.RequiredArgsConstructor;
import org.example.testoauth.domain.User.dao.Member;
import org.example.testoauth.domain.User.dto.OAuth2UserInfo;
import org.example.testoauth.domain.User.dto.PrincipalDetails;
import org.example.testoauth.repository.MemberRepository;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@RequiredArgsConstructor
@Service
public class CustomOauth2UserService extends DefaultOAuth2UserService {

    private final MemberRepository memberRepository;

    @Transactional
    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        Map<String, Object> oAuth2UserAttributes =  super.loadUser(userRequest).getAttributes();

        String registrationId = userRequest.getClientRegistration().getRegistrationId();

        String userNameAttributeName = userRequest.getClientRegistration().getProviderDetails()
                .getUserInfoEndpoint().getUserNameAttributeName();

        OAuth2UserInfo oAuth2UserInfo = null;

        oAuth2UserInfo = OAuth2UserInfo.of(registrationId, oAuth2UserAttributes);

        Member member = getOrSave(oAuth2UserInfo);


        return new PrincipalDetails(member,oAuth2UserAttributes,userNameAttributeName);
    }

    private Member getOrSave(OAuth2UserInfo oAuth2UserInfo){
        Member member = memberRepository.findByEmail(oAuth2UserInfo.email())
                .orElseGet(oAuth2UserInfo::toEntity);
        return memberRepository.save(member);
    }

}
