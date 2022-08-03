package RegexTest;

public class RegexExample {
    public static void main(String args[]) {
        String str = "gpcoder";

        str.matches("."); // = false: vì khớp với ký tự bất kỳ nhưng không chỉ có một ký tự

        str.matches(".*"); // = true: vì khớp với bất kỳ ký tự nào 0 hoặc nhiều lần

        str.matches("^g"); // = false: vì khớp với ký tự bắt đầu là g nhưng không chỉ có một ký tự

        str.matches("^g.+"); // = true: vì khớp với ký tự bắt đầu là g và sau đó là ký tự bất kỳ, xuất hiện 1 hoặc nhiều lần.

        str.matches("r$"); // = false: vì khớp với ký tự kết thúc là r nhưng không chỉ có một ký tự

        str.matches(".{1,6}r$"); // = true: Ký tự bất kỳ xuất hiện 6 lần và kết thúc là r.
    }
    
}
