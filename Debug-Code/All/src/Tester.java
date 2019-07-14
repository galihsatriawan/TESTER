import java.util.ArrayList;

public class Tester {
    static String[] test = {"0.2","0.3"};
    public static void main(String args[]){
        ArrayList<Double> datas = getData(1,"double");
        double temp = 0;
        for(double data : datas){
            temp += data;
        }

        System.out.println(temp);
    }



    public static <T> ArrayList<T> getData(int resources_id, String cast){
        ArrayList<T> result = new ArrayList<>();

        String[] datas = test;
        for(String data : datas){
            switch (cast){
                case "double":{
                    Double temp = Double.parseDouble(data);
                    result.add((T) temp);
                    break;
                }
                default:{
                    String temp = data;
                    result.add((T) temp);
                    break;
                }
            }


        }
        return result;
    }
}
