package doubly_linked_list.functionality_for_text_editor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(5);

        editor.addTextState("State 1: Hello");
        editor.addTextState("State 2: Hello, World");
        editor.addTextState("State 3: Hello, World!");
        editor.addTextState("State 4: Hello, World! How");
        editor.addTextState("State 5: Hello, World! How are");
        editor.addTextState("State 6: Hello, World! How are you?");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addTextState("State 7: Overwritten");
        editor.displayCurrentState();

        editor.redo();

        editor.addTextState("State 8: Testing");
        editor.addTextState("State 9: Undo/Redo");
        editor.addTextState("State 10: Functionality");

        editor.displayCurrentState();

        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.displayCurrentState();
    }
}
