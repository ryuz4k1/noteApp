package com.globalhell.mysqliteproject.persistance;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.globalhell.mysqliteproject.async.DeleteAsyncTask;
import com.globalhell.mysqliteproject.async.InsertAsyncTask;
import com.globalhell.mysqliteproject.async.UpdateAsyncTask;
import com.globalhell.mysqliteproject.models.Note;

import java.util.List;

public class NoteRepository  {
    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        this.mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note){
        new InsertAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public void updateNoteTask(Note note){
        new UpdateAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public LiveData<List<Note>> retrieveNotesTask() {
        return mNoteDatabase.getNoteDao().getNotes();
    }

    public void deleteNoteTask(Note note){
        new DeleteAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }
}
