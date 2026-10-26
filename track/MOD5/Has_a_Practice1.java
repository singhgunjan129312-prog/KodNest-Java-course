class Os {
    Os(){
        System.out.println("Os is installed");
    }
    void checkOs(){
        System.out.println("Os is still executing");
    }
}
class Mobile{
    Os o = new Os();
    Mobile(){
        System.out.println("Mobile created with Os");
    }
}
class Has_a_Practice1{
    public static void main(String[] args) {
        Mobile m;
        m = new Mobile();
        m.o.checkOs();
       // m= null;
        //m.o.checkOs();//exception
    }
}