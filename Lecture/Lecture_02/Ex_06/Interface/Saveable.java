package Lecture.Lecture_02.Ex_06.Interface;

import Lecture.Lecture_02.Ex_06.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
