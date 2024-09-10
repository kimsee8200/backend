import java.io.*;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class boj18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String> list = new ArrayList<>();
        int repeat = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat; i++){
            list.add(br.readLine());
        }

        Deque<Integer> arrayList = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(String order : list){
            String[] strings = order.split(" ");

            if(strings[0].equals("push")){
                arrayList.add(Integer.parseInt(strings[1]));
            }else if(strings[0].equals("pop")){
                try{
                    answer.add(arrayList.remove());
                }catch (Exception e){
                    answer.add(-1);
                }
            }else if (strings[0].equals("front")) {
                if (!arrayList.isEmpty()) {
                    answer.add(arrayList.peek());
                }else {
                    answer.add(-1);
                }
            }else if(strings[0].equals("back")){
                if (!arrayList.isEmpty()) {
                    answer.add(arrayList.getLast());
                }else {
                    answer.add(-1);
                }
            }else if (strings[0].equals("size")) {
                answer.add(arrayList.size());
            }else if (strings[0].equals("empty")) {
                answer.add(arrayList.isEmpty()?1:0);
            }

        }

        bw.flush();
        for(int element : answer){
            try {
                bw.write(element+"\n");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        bw.close();
    }
}
