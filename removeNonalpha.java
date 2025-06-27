public class removeNonalpha {
    public static void main(String[] args) {
        String paragraph="My name is UTkarsh309! lets's clean it now";
        String lowerPara=paragraph.toLowerCase();
        String removednon=lowerPara.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(removednon);
    }
}
