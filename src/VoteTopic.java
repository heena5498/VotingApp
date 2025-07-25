abstract public class VoteTopic {
    final private static String[] topics = {"Top tech company currently leading in AI advancement", "Best company out of the famous \"FAANG\" stack", "Top computer science specialization this current year", "Elon Musk VS. Mark Zuckerberg", "NVIDIA VS. AMD"};

    public static void getTopics(){
        int count = 1;
        for (String topic : topics){
            System.out.println(count + ". " + topic);
            count++;

        }
    }

}
