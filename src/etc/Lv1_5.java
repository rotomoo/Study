package etc;

class Lv1_5 {
    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return new String(ch);
    }
}
