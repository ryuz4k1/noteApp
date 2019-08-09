package com.globalhell.mysqliteproject.async;

import android.os.AsyncTask;

import com.globalhell.mysqliteproject.models.Note;
import com.globalhell.mysqliteproject.persistance.NoteDao;

public class InsertAsyncTask extends AsyncTask<Note,Void,Void> {

    private NoteDao mNoteDao;

    public InsertAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.insertNotes(notes);
        return null;
    }
}
