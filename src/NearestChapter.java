

public class NearestChapter {

    public static void main(String[] args) {

    }

    public static String nearestChapter(Chapter[] chapter, int page) {

        int tempPage = chapter[0].getPage();
        int pageDiff = Math.abs(page - chapter[0].getPage());
        String chap = chapter[0].getName();

        for(int i = 1; i < chapter.length; i++) {

            if(Math.abs(page - chapter[i].getPage()) < pageDiff) {
                pageDiff = Math.abs(page - chapter[i].getPage());
                chap = chapter[i].getName();

            } else if(Math.abs(page - chapter[i].getPage()) == pageDiff && tempPage < chapter[i].getPage()) {
                tempPage = chapter[i].getPage();
                chap = chapter[i].getName();
            }
        }

        return chap;

    }

    class Chapter {
        private String name;
        private int page;

        public Chapter(String name, int page) {
            this.name = name;
            this.page = page;
        }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getPage() { return page; }
        public void setPage(int page) { this.page = page; }
    }
}
