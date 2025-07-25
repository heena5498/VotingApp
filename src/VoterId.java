abstract public class VoterId {
    public static String voterId;

    public static String getVoterId(String votersFirstName, String votersLastName){
        String id = votersFirstName.substring(0, 2) + votersLastName.substring(0, 2);

        voterId = id;

        return voterId;
    }

}
