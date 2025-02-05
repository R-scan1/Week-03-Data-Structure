package doubly_linked_list.functionality_for_text_editor;

class TextEditor {
    private TextStateNode currentState;
    private int historySize;
    private int currentHistoryCount;

    public TextEditor(int historySize) {
        this.currentState = null;
        this.historySize = historySize;
        this.currentHistoryCount = 0;
    }

    public void addTextState(String newText) {
        TextStateNode newState = new TextStateNode(newText);

        if (currentState == null) {
            currentState = newState;
            currentHistoryCount++;
            return;
        }

        currentState.next = null;

        newState.prev = currentState;
        currentState.next = newState;
        currentState = newState;

        currentHistoryCount++;
        if (currentHistoryCount > historySize) {
            trimOldestState();
        }
    }

    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
        } else {
            System.out.println("Nothing to redo!");
        }
    }

    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current Text State: " + currentState.textContent);
        } else {
            System.out.println("No state available!");
        }
    }

    private void trimOldestState() {
        TextStateNode oldestState = currentState;

        while (oldestState.prev != null) {
            oldestState = oldestState.prev;
        }

        if (oldestState.next != null) {
            oldestState.next.prev = null;
        }
        currentHistoryCount--;
    }
}
