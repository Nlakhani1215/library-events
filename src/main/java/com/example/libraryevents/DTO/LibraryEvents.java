package com.example.libraryevents.DTO;

import java.awt.print.Book;

public record LibraryEvents(Integer libraryEventId,
                            LibraryEventType libraryEventType,
                                    Book book) {
}
