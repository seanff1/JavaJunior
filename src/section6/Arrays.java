package section6;

public class Arrays {

    public static void main(String[] args) {

        multiArrayTranverse();
    }

    public static void singleArrayTranverse()
    {
        String [] alphabet = {"a", "b", "c", "d", "e"};

        for(int i =0; i < alphabet.length; i++)
        {
            System.out.println(alphabet[i]);
        }

        for(String letter: alphabet)
        {
            System.out.println(letter);
        }
    }

    public static void multiArrayTranverse()
    {
        // 1) Intialise multi dimentional array
        // 2) Find out size


        String[][] users = {
                {"John", "111"},
                {"Sammy", "222"},
                {"Racheal", "333"}
        };

        int numOfUsers = users.length;
        int numOfFields = users[0].length;
        System.out.println("number of users: " + numOfUsers);
        System.out.println("number of fields: " + numOfFields);

        //1 way to do it if know values in advance
        for (int i = 0; i<numOfUsers; i++)
        {
                String firstName = users[i][0];
                String userNumber = users[i][1];
            System.out.println(firstName + ", " + userNumber);
        }
    }
}
