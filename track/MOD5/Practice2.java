class Book{
    private int pageNum;
    public void setData(int x){
        if(x>0){
            pageNum=x;
        }
    }
    public int getData(){
        return pageNum;
    }
}
public class Practice2{
    public static void main(String[] args){
        Book b=new Book();
        b.setData(100);
        System.out.println(b.getData());
    }
}