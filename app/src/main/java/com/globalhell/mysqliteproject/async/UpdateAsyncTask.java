package com.globalhell.mysqliteproject.async;

import android.os.AsyncTask;

import com.globalhell.mysqliteproject.models.Note;
import com.globalhell.mysqliteproject.persistance.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.updateNotes(notes);
        return null;
    }

}
