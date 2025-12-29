import java.util.HashMap;

class HashMaps{
    public static void main(String[] args){
        HashMap<String,Integer> examScores = new HashMap<String, Integer>() ;

        examScores.put("Math", 75);
        examScores.put("Physics", 85);
        examScores.put("Computer Science", 100);
        examScores.put("English", 100);


      examScores.forEach((subject, score) -> {
        examScores.replace(subject, score - 10);
              });

      System.out.println(examScores.toString());
    }
}
