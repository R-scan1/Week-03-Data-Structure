package singly_linked_list.student_record_management;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        studentList.addAtBeginning(1, "Raj", 22, 'A');
        studentList.addAtEnd(2, "Manish", 21, 'B');
        studentList.addAtPosition(2, 3, "Arpita", 23, 'B');

        studentList.displayAllStudents();

        studentList.searchByRollNumber(2);

        studentList.updateGradeByRollNumber(3, 'A');

        studentList.deleteByRollNumber(1);

        studentList.displayAllStudents();
    }
}
