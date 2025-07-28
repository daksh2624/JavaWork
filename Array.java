public class Array {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String args[]){

        // int marks[] = new int[100];
        // // int fruits[] = {"5","6","7"};

        // // how too take input of array
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // marks[2] = marks[2] + 1;
        
        // System.out.println("Updated makes : " + marks[2]);

        // // Array length

        
        // System.out.println(>>>"Array length" + marks.length);


        int marks[] = {100,99,87};
        update(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
    
}
