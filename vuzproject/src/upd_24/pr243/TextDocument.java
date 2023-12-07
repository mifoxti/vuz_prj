package upd_24.pr243;

class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Text document opened.");
    }

    @Override
    public void save() {
        System.out.println("Text document saved.");
    }

    @Override
    public void close() {
        System.out.println("Text document closed.");
    }

    @Override
    public void edit() {
        System.out.println("Editing text document.");
    }
}
