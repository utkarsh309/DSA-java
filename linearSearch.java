public class linearSearch {
    public static int linearSearchFun(int [] items,int key){
        for(int i=0;i<items.length;i++){
            if(items[i]==key){
                return i;   
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] numbers={10,20,40,5,50,40};
        int key=50;
        int result=linearSearchFun(numbers, key);
        if(result==-1){
            System.out.println("item not found");
        }else{
            System.out.println("item found at index "+result);
        }
    }
    
}
