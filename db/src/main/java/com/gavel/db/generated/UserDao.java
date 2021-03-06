package com.gavel.db.generated;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.gavel.db.entity.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, String> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property UserId = new Property(0, String.class, "userId", true, "USER_ID");
        public final static Property UserType = new Property(1, String.class, "userType", false, "USER_TYPE");
        public final static Property Mobile = new Property(2, String.class, "mobile", false, "MOBILE");
        public final static Property Password = new Property(3, String.class, "password", false, "PASSWORD");
        public final static Property UserName = new Property(4, String.class, "userName", false, "USER_NAME");
        public final static Property NickName = new Property(5, String.class, "nickName", false, "NICK_NAME");
        public final static Property Token = new Property(6, String.class, "token", false, "TOKEN");
    }


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"USER_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: userId
                "\"USER_TYPE\" TEXT," + // 1: userType
                "\"MOBILE\" TEXT," + // 2: mobile
                "\"PASSWORD\" TEXT," + // 3: password
                "\"USER_NAME\" TEXT," + // 4: userName
                "\"NICK_NAME\" TEXT," + // 5: nickName
                "\"TOKEN\" TEXT);"); // 6: token
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(1, userId);
        }
 
        String userType = entity.getUserType();
        if (userType != null) {
            stmt.bindString(2, userType);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(3, mobile);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(4, password);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(5, userName);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(6, nickName);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(7, token);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(1, userId);
        }
 
        String userType = entity.getUserType();
        if (userType != null) {
            stmt.bindString(2, userType);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(3, mobile);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(4, password);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(5, userName);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(6, nickName);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(7, token);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // userId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userType
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // mobile
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // password
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // userName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // nickName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // token
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setUserId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setUserType(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMobile(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPassword(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNickName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setToken(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final String updateKeyAfterInsert(User entity, long rowId) {
        return entity.getUserId();
    }
    
    @Override
    public String getKey(User entity) {
        if(entity != null) {
            return entity.getUserId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        return entity.getUserId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
