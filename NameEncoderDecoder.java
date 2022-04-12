class NameEncoderDecoder{
    String startName = "NOTFORYOU";
    String endName = "YESNOTFORYOU";

    public String encode(String name){
        return startName+
                name
                        .replace("e","1")
                        .replace("u","2")
                        .replace("i","3")
                        .replace("o","4")
                        .replace("a","5")+
                endName;

    }

    public String decode(String name){
        return name.substring(startName.length(),name.length()-endName.length())
                .replace("1","e")
                .replace("2","u")
                .replace("3","i")
                .replace("4","o")
                .replace("5","a");
    }
}