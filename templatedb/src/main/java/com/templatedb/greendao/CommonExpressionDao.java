package com.templatedb.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import template.com.templatedb.CommonExpression;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CommonExpression".
*/
public class CommonExpressionDao extends AbstractDao<CommonExpression, Long> {

    public static final String TABLENAME = "CommonExpression";

    /**
     * Properties of entity CommonExpression.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property PrimaryKey = new Property(0, Long.class, "primaryKey", true, "_id");
        public final static Property Id = new Property(1, String.class, "id", false, "id");
        public final static Property Name = new Property(2, String.class, "name", false, "name");
        public final static Property Stamp = new Property(3, String.class, "stamp", false, "stamp");
        public final static Property Fieldid = new Property(4, String.class, "fieldid", false, "fieldid");
    }


    public CommonExpressionDao(DaoConfig config) {
        super(config);
    }
    
    public CommonExpressionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CommonExpression\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: primaryKey
                "\"id\" TEXT," + // 1: id
                "\"name\" TEXT," + // 2: name
                "\"stamp\" TEXT," + // 3: stamp
                "\"fieldid\" TEXT);"); // 4: fieldid
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_CommonExpression_id ON \"CommonExpression\"" +
                " (\"id\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CommonExpression\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CommonExpression entity) {
        stmt.clearBindings();
 
        Long primaryKey = entity.getPrimaryKey();
        if (primaryKey != null) {
            stmt.bindLong(1, primaryKey);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String stamp = entity.getStamp();
        if (stamp != null) {
            stmt.bindString(4, stamp);
        }
 
        String fieldid = entity.getFieldid();
        if (fieldid != null) {
            stmt.bindString(5, fieldid);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CommonExpression entity) {
        stmt.clearBindings();
 
        Long primaryKey = entity.getPrimaryKey();
        if (primaryKey != null) {
            stmt.bindLong(1, primaryKey);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String stamp = entity.getStamp();
        if (stamp != null) {
            stmt.bindString(4, stamp);
        }
 
        String fieldid = entity.getFieldid();
        if (fieldid != null) {
            stmt.bindString(5, fieldid);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CommonExpression readEntity(Cursor cursor, int offset) {
        CommonExpression entity = new CommonExpression( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // primaryKey
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // stamp
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // fieldid
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CommonExpression entity, int offset) {
        entity.setPrimaryKey(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setStamp(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFieldid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CommonExpression entity, long rowId) {
        entity.setPrimaryKey(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CommonExpression entity) {
        if(entity != null) {
            return entity.getPrimaryKey();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CommonExpression entity) {
        return entity.getPrimaryKey() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
