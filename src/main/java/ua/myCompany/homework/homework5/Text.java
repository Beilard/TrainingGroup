package ua.myCompany.homework.homework5;



public class Text {
    private String header;
    private StringBuilder sb = new StringBuilder();

    public Text(Sentence... sentences) {
        header = "No header";
        for (Sentence s : sentences) {
            sb.append(s).append(" ");
        }
    }

    public Text(String header, Sentence... sentences) {
        this.header = header;
        for (Sentence s : sentences) {
            sb.append(s).append(" ");
        }
    }

    void append(Sentence sentence) {
        sb.append(sentence).append(" ");
    }
    void append(Word word) {
        sb.append(word).append(" ");
    }

    void printText(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\t" + header + "\n" + sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        if (!header.equals(text.header)) return false;
        return sb != null ? sb.equals(text.sb) : text.sb == null;
    }

    @Override
    public int hashCode() {
        int result = header.hashCode();
        result = 31 * result + (sb != null ? sb.hashCode() : 0);
        return result;
    }
}
