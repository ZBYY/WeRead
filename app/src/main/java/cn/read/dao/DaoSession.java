package cn.read.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import cn.read.bean.BeautyPhotoInfo;
import cn.read.bean.ChatLog;
import cn.read.bean.NewsChannelTable;
import cn.read.bean.NewsSummary;
import cn.read.bean.VideosChannelTable;
import cn.read.bean.VideosSummary;

import cn.read.dao.BeautyPhotoInfoDao;
import cn.read.dao.ChatLogDao;
import cn.read.dao.NewsChannelTableDao;
import cn.read.dao.NewsSummaryDao;
import cn.read.dao.VideosChannelTableDao;
import cn.read.dao.VideosSummaryDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig beautyPhotoInfoDaoConfig;
    private final DaoConfig chatLogDaoConfig;
    private final DaoConfig newsChannelTableDaoConfig;
    private final DaoConfig newsSummaryDaoConfig;
    private final DaoConfig videosChannelTableDaoConfig;
    private final DaoConfig videosSummaryDaoConfig;

    private final BeautyPhotoInfoDao beautyPhotoInfoDao;
    private final ChatLogDao chatLogDao;
    private final NewsChannelTableDao newsChannelTableDao;
    private final NewsSummaryDao newsSummaryDao;
    private final VideosChannelTableDao videosChannelTableDao;
    private final VideosSummaryDao videosSummaryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        beautyPhotoInfoDaoConfig = daoConfigMap.get(BeautyPhotoInfoDao.class).clone();
        beautyPhotoInfoDaoConfig.initIdentityScope(type);

        chatLogDaoConfig = daoConfigMap.get(ChatLogDao.class).clone();
        chatLogDaoConfig.initIdentityScope(type);

        newsChannelTableDaoConfig = daoConfigMap.get(NewsChannelTableDao.class).clone();
        newsChannelTableDaoConfig.initIdentityScope(type);

        newsSummaryDaoConfig = daoConfigMap.get(NewsSummaryDao.class).clone();
        newsSummaryDaoConfig.initIdentityScope(type);

        videosChannelTableDaoConfig = daoConfigMap.get(VideosChannelTableDao.class).clone();
        videosChannelTableDaoConfig.initIdentityScope(type);

        videosSummaryDaoConfig = daoConfigMap.get(VideosSummaryDao.class).clone();
        videosSummaryDaoConfig.initIdentityScope(type);

        beautyPhotoInfoDao = new BeautyPhotoInfoDao(beautyPhotoInfoDaoConfig, this);
        chatLogDao = new ChatLogDao(chatLogDaoConfig, this);
        newsChannelTableDao = new NewsChannelTableDao(newsChannelTableDaoConfig, this);
        newsSummaryDao = new NewsSummaryDao(newsSummaryDaoConfig, this);
        videosChannelTableDao = new VideosChannelTableDao(videosChannelTableDaoConfig, this);
        videosSummaryDao = new VideosSummaryDao(videosSummaryDaoConfig, this);

        registerDao(BeautyPhotoInfo.class, beautyPhotoInfoDao);
        registerDao(ChatLog.class, chatLogDao);
        registerDao(NewsChannelTable.class, newsChannelTableDao);
        registerDao(NewsSummary.class, newsSummaryDao);
        registerDao(VideosChannelTable.class, videosChannelTableDao);
        registerDao(VideosSummary.class, videosSummaryDao);
    }
    
    public void clear() {
        beautyPhotoInfoDaoConfig.getIdentityScope().clear();
        chatLogDaoConfig.getIdentityScope().clear();
        newsChannelTableDaoConfig.getIdentityScope().clear();
        newsSummaryDaoConfig.getIdentityScope().clear();
        videosChannelTableDaoConfig.getIdentityScope().clear();
        videosSummaryDaoConfig.getIdentityScope().clear();
    }

    public BeautyPhotoInfoDao getBeautyPhotoInfoDao() {
        return beautyPhotoInfoDao;
    }

    public ChatLogDao getChatLogDao() {
        return chatLogDao;
    }

    public NewsChannelTableDao getNewsChannelTableDao() {
        return newsChannelTableDao;
    }

    public NewsSummaryDao getNewsSummaryDao() {
        return newsSummaryDao;
    }

    public VideosChannelTableDao getVideosChannelTableDao() {
        return videosChannelTableDao;
    }

    public VideosSummaryDao getVideosSummaryDao() {
        return videosSummaryDao;
    }

}