public class product
{
	    int pcode;
	    String pname;
	    double price;
	    
	    void data(int c, String n, double p){
	        pcode=c;
	        pname=n;
	        price=p;
	    }
	    void display(){
	        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	        
	    }  
	    static void findLowest(double price1,double price2, double price3){
	    if(price1<=price2 && price1<=price3){
	        System.out.println("\nmonitor is of the lowest price!");
	        
	    }
	    else if(price2<=price1 && price2<=price3){
	        System.out.println("\nmouse is of the lowest price!");
	        
	    }
	    else{
	        System.out.println("\ncpu is of the lowest price!");
	        
	    }
	    
	   }
	  public static void main(String[] args){
	        product obj1 = new product();
	        product obj2 = new product();
	        product obj3 = new product();
	        obj1.data(101,"monitor",800.0);
	        obj2.data(102,"mouse",138.40);
	        obj3.data(103,"cpu",680.00);
	        System.out.println("Product Information:\n Product_Code\tProduct_Name\tProduct_Price");
	        obj1.display();
	        obj2.display();
	        obj3.display();
	        findLowest(obj1.price,obj2.price,obj3.price);    
	        
	    }
	}
 
