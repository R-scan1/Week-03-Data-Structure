package doubly_linked_list.functionality_for_text_editor;

class TextStateNode {
    String textContent;
    TextStateNode next;
    TextStateNode prev;

    public TextStateNode(String textContent) {
        this.textContent = textContent;
        this.next = null;
        this.prev = null;
    }
}
