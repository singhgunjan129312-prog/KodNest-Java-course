

class ArrCla{

        void search(int[] arr,int key){
            boolean found=false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    System.out.println("Element is Found at index: " + i);
                    found=true;
                    break;
                }

            }
            if(!found){
                System.out.println("Element is not Found");
            }
        }
    }

public class LinearSearch{
    public static void main(String[] args) {
        int[] arr={4,7,9,6,8,3};
        int key=18;
        ArrCla s=new ArrCla();
        s.search(arr,key);
        
    }
}