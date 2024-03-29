package com.globalhell.mysqliteproject.async;

import android.os.AsyncTask;

import com.globalhell.mysqliteproject.models.Note;
import com.globalhell.mysqliteproject.persistance.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note,Void,Void> {

    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.delete(notes);
        return null;
    }
}
