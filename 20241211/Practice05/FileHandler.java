public class FileHandler implements ReadWritable {
    @Override
    public String readContent() {
        return "파일에서 내용을 읽습니다.";
    }

    @Override
    public void writeContent(String content) {
        System.out.println("파일에 내용을 썼습니다.");
    }
}
