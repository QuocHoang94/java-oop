package lesson4;

public class Exercise04 {
    public static void main(String[] args){
        String url = "https://google.com";
//        char[] subStr = url.toCharArray();
//        int urlLength = Integer.parseInt(subStr.length);
        String [] yourHttpStr = url.split("://");
        if(yourHttpStr[0].equals("https")){
            System.out.println("your Protocol: " + yourHttpStr[0]);
        }else{ System.out.println("your Protocol http");}

        int idx = url.lastIndexOf('.');
        int lengthStr = url.length();
        String domainName = url.substring(idx,lengthStr);
        if(domainName.equals(".com")){
            System.out.println("Your Domain Name : " + domainName);
        }else{
            System.out.println("Your Domain Name : .net");
        }
    }
}
