package com.yjn.blog.base.item;

import java.util.List;

/**
 * @author yang.jianan
 * @date 2018/02/06 09:39.
 * Desc：根据条件查询博文列表
 */

public class BlogQryByPagerItem {

    /**
     * pageNum : 1
     * pageSize : 20
     * size : 20
     * startRow : 0
     * endRow : 19
     * total : 20
     * pages : 1
     * list : [{"id":1,"title":"博文标题1","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-03 11:18:50","updateDate":"2018-01-03 11:18:50","content":"博文正文1","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":3,"postId":1,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":2,"title":"博文标题2","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文2","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":4,"postId":2,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":3,"title":"博文标题3","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文3","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":5,"postId":3,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":4,"title":"博文标题4","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文4","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":6,"postId":4,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":5,"title":"博文标题5","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文5","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":7,"postId":5,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":6,"title":"博文标题6","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文6","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":8,"postId":6,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":7,"title":"博文标题7","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文7","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":9,"postId":7,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":8,"title":"博文标题8","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文8","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":10,"postId":8,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":9,"title":"博文标题9","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文9","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":11,"postId":9,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":10,"title":"博文标题10","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文10","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":12,"postId":10,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":11,"title":"博文标题11","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文11","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":13,"postId":11,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":12,"title":"博文标题12","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文12","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":14,"postId":12,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":13,"title":"博文标题13","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文13","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":15,"postId":13,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":14,"title":"博文标题14","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文14","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":16,"postId":14,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":15,"title":"博文标题15","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文15","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":17,"postId":15,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":16,"title":"博文标题16","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文16","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":18,"postId":16,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":17,"title":"博文标题17","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文17","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":19,"postId":17,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":18,"title":"博文标题18","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文18","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":20,"postId":18,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":19,"title":"博文标题19","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文19","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":21,"postId":19,"readTimes":0,"commentedTimes":0,"likedTimes":0}}},{"id":20,"title":"博文标题20","createdDate":"2017-12-27 14:59:29","originalUrl":"106.14.156.120","type":null,"archiveId":0,"authorId":1,"enableComment":null,"state":null,"stateDate":"2018-01-04 12:26:47","updateDate":"2018-01-03 11:18:50","content":"博文正文20","author":{"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null},"archive":null,"tagList":null,"countStatistic4Post":{"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":22,"postId":20,"readTimes":0,"commentedTimes":0,"likedTimes":0}}}]
     * prePage : 0
     * nextPage : 0
     * isFirstPage : true
     * isLastPage : true
     * hasPreviousPage : false
     * hasNextPage : false
     * navigatePages : 8
     * navigatepageNums : [1]
     * navigateFirstPage : 1
     * navigateLastPage : 1
     * firstPage : 1
     * lastPage : 1
     */

    private int pageNum;
    private int pageSize;
    private int size;
    private int startRow;
    private int endRow;
    private int total;
    private int pages;
    private int prePage;
    private int nextPage;
    private boolean isFirstPage;
    private boolean isLastPage;
    private boolean hasPreviousPage;
    private boolean hasNextPage;
    private int navigatePages;
    private int navigateFirstPage;
    private int navigateLastPage;
    private int firstPage;
    private int lastPage;
    private List<ListBean> list;
    private List<Integer> navigatepageNums;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public boolean isIsFirstPage() {
        return isFirstPage;
    }

    public void setIsFirstPage(boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
    }

    public boolean isIsLastPage() {
        return isLastPage;
    }

    public void setIsLastPage(boolean isLastPage) {
        this.isLastPage = isLastPage;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public int getNavigatePages() {
        return navigatePages;
    }

    public void setNavigatePages(int navigatePages) {
        this.navigatePages = navigatePages;
    }

    public int getNavigateFirstPage() {
        return navigateFirstPage;
    }

    public void setNavigateFirstPage(int navigateFirstPage) {
        this.navigateFirstPage = navigateFirstPage;
    }

    public int getNavigateLastPage() {
        return navigateLastPage;
    }

    public void setNavigateLastPage(int navigateLastPage) {
        this.navigateLastPage = navigateLastPage;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(int firstPage) {
        this.firstPage = firstPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public List<Integer> getNavigatepageNums() {
        return navigatepageNums;
    }

    public void setNavigatepageNums(List<Integer> navigatepageNums) {
        this.navigatepageNums = navigatepageNums;
    }

    public static class ListBean {
        /**
         * id : 1
         * title : 博文标题1
         * createdDate : 2017-12-27 14:59:29
         * originalUrl : 106.14.156.120
         * type : null
         * archiveId : 0
         * authorId : 1
         * enableComment : null
         * state : null
         * stateDate : 2018-01-03 11:18:50
         * updateDate : 2018-01-03 11:18:50
         * content : 博文正文1
         * author : {"id":null,"penName":null,"motto":null,"state":null,"updateDate":null,"user":{"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"},"archiveList":null,"tagList":null,"userContactStation4WebsiteList":null}
         * archive : null
         * tagList : null
         * countStatistic4Post : {"id":null,"authorId":null,"type":null,"state":null,"createDate":null,"updateDate":null,"countStatistic4Blog":null,"countStatistic4Post":{"countStatisticId":3,"postId":1,"readTimes":0,"commentedTimes":0,"likedTimes":0}}
         */

        private int id;
        private String title;
        private String createdDate;
        private String originalUrl;
        private Object type;
        private int archiveId;
        private int authorId;
        private Object enableComment;
        private Object state;
        private String stateDate;
        private String updateDate;
        private String content;
        private AuthorBean author;
        private Object archive;
        private Object tagList;
        private CountStatistic4PostBeanX countStatistic4Post;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public String getOriginalUrl() {
            return originalUrl;
        }

        public void setOriginalUrl(String originalUrl) {
            this.originalUrl = originalUrl;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public int getArchiveId() {
            return archiveId;
        }

        public void setArchiveId(int archiveId) {
            this.archiveId = archiveId;
        }

        public int getAuthorId() {
            return authorId;
        }

        public void setAuthorId(int authorId) {
            this.authorId = authorId;
        }

        public Object getEnableComment() {
            return enableComment;
        }

        public void setEnableComment(Object enableComment) {
            this.enableComment = enableComment;
        }

        public Object getState() {
            return state;
        }

        public void setState(Object state) {
            this.state = state;
        }

        public String getStateDate() {
            return stateDate;
        }

        public void setStateDate(String stateDate) {
            this.stateDate = stateDate;
        }

        public String getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public Object getArchive() {
            return archive;
        }

        public void setArchive(Object archive) {
            this.archive = archive;
        }

        public Object getTagList() {
            return tagList;
        }

        public void setTagList(Object tagList) {
            this.tagList = tagList;
        }

        public CountStatistic4PostBeanX getCountStatistic4Post() {
            return countStatistic4Post;
        }

        public void setCountStatistic4Post(CountStatistic4PostBeanX countStatistic4Post) {
            this.countStatistic4Post = countStatistic4Post;
        }

        public static class AuthorBean {
            /**
             * id : null
             * penName : null
             * motto : null
             * state : null
             * updateDate : null
             * user : {"id":1,"accNbr":"505516920@qq.com","password":"kevin19920614","realName":"jinyanan","nickName":"littlefisher","enName":"Kevin","userDesc":"管理员","state":null,"regDate":"2017-05-25 06:31:27","lastLoginDate":"2017-05-25 06:31:27"}
             * archiveList : null
             * tagList : null
             * userContactStation4WebsiteList : null
             */

            private Object id;
            private Object penName;
            private Object motto;
            private Object state;
            private Object updateDate;
            private UserBean user;
            private Object archiveList;
            private Object tagList;
            private Object userContactStation4WebsiteList;

            public Object getId() {
                return id;
            }

            public void setId(Object id) {
                this.id = id;
            }

            public Object getPenName() {
                return penName;
            }

            public void setPenName(Object penName) {
                this.penName = penName;
            }

            public Object getMotto() {
                return motto;
            }

            public void setMotto(Object motto) {
                this.motto = motto;
            }

            public Object getState() {
                return state;
            }

            public void setState(Object state) {
                this.state = state;
            }

            public Object getUpdateDate() {
                return updateDate;
            }

            public void setUpdateDate(Object updateDate) {
                this.updateDate = updateDate;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public Object getArchiveList() {
                return archiveList;
            }

            public void setArchiveList(Object archiveList) {
                this.archiveList = archiveList;
            }

            public Object getTagList() {
                return tagList;
            }

            public void setTagList(Object tagList) {
                this.tagList = tagList;
            }

            public Object getUserContactStation4WebsiteList() {
                return userContactStation4WebsiteList;
            }

            public void setUserContactStation4WebsiteList(Object userContactStation4WebsiteList) {
                this.userContactStation4WebsiteList = userContactStation4WebsiteList;
            }

            public static class UserBean {
                /**
                 * id : 1
                 * accNbr : 505516920@qq.com
                 * password : kevin19920614
                 * realName : jinyanan
                 * nickName : littlefisher
                 * enName : Kevin
                 * userDesc : 管理员
                 * state : null
                 * regDate : 2017-05-25 06:31:27
                 * lastLoginDate : 2017-05-25 06:31:27
                 */

                private int id;
                private String accNbr;
                private String password;
                private String realName;
                private String nickName;
                private String enName;
                private String userDesc;
                private Object state;
                private String regDate;
                private String lastLoginDate;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getAccNbr() {
                    return accNbr;
                }

                public void setAccNbr(String accNbr) {
                    this.accNbr = accNbr;
                }

                public String getPassword() {
                    return password;
                }

                public void setPassword(String password) {
                    this.password = password;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getNickName() {
                    return nickName;
                }

                public void setNickName(String nickName) {
                    this.nickName = nickName;
                }

                public String getEnName() {
                    return enName;
                }

                public void setEnName(String enName) {
                    this.enName = enName;
                }

                public String getUserDesc() {
                    return userDesc;
                }

                public void setUserDesc(String userDesc) {
                    this.userDesc = userDesc;
                }

                public Object getState() {
                    return state;
                }

                public void setState(Object state) {
                    this.state = state;
                }

                public String getRegDate() {
                    return regDate;
                }

                public void setRegDate(String regDate) {
                    this.regDate = regDate;
                }

                public String getLastLoginDate() {
                    return lastLoginDate;
                }

                public void setLastLoginDate(String lastLoginDate) {
                    this.lastLoginDate = lastLoginDate;
                }
            }
        }

        public static class CountStatistic4PostBeanX {
            /**
             * id : null
             * authorId : null
             * type : null
             * state : null
             * createDate : null
             * updateDate : null
             * countStatistic4Blog : null
             * countStatistic4Post : {"countStatisticId":3,"postId":1,"readTimes":0,"commentedTimes":0,"likedTimes":0}
             */

            private Object id;
            private Object authorId;
            private Object type;
            private Object state;
            private Object createDate;
            private Object updateDate;
            private Object countStatistic4Blog;
            private CountStatistic4PostBean countStatistic4Post;

            public Object getId() {
                return id;
            }

            public void setId(Object id) {
                this.id = id;
            }

            public Object getAuthorId() {
                return authorId;
            }

            public void setAuthorId(Object authorId) {
                this.authorId = authorId;
            }

            public Object getType() {
                return type;
            }

            public void setType(Object type) {
                this.type = type;
            }

            public Object getState() {
                return state;
            }

            public void setState(Object state) {
                this.state = state;
            }

            public Object getCreateDate() {
                return createDate;
            }

            public void setCreateDate(Object createDate) {
                this.createDate = createDate;
            }

            public Object getUpdateDate() {
                return updateDate;
            }

            public void setUpdateDate(Object updateDate) {
                this.updateDate = updateDate;
            }

            public Object getCountStatistic4Blog() {
                return countStatistic4Blog;
            }

            public void setCountStatistic4Blog(Object countStatistic4Blog) {
                this.countStatistic4Blog = countStatistic4Blog;
            }

            public CountStatistic4PostBean getCountStatistic4Post() {
                return countStatistic4Post;
            }

            public void setCountStatistic4Post(CountStatistic4PostBean countStatistic4Post) {
                this.countStatistic4Post = countStatistic4Post;
            }

            public static class CountStatistic4PostBean {
                /**
                 * countStatisticId : 3
                 * postId : 1
                 * readTimes : 0
                 * commentedTimes : 0
                 * likedTimes : 0
                 */

                private int countStatisticId;
                private int postId;
                private int readTimes;
                private int commentedTimes;
                private int likedTimes;

                public int getCountStatisticId() {
                    return countStatisticId;
                }

                public void setCountStatisticId(int countStatisticId) {
                    this.countStatisticId = countStatisticId;
                }

                public int getPostId() {
                    return postId;
                }

                public void setPostId(int postId) {
                    this.postId = postId;
                }

                public int getReadTimes() {
                    return readTimes;
                }

                public void setReadTimes(int readTimes) {
                    this.readTimes = readTimes;
                }

                public int getCommentedTimes() {
                    return commentedTimes;
                }

                public void setCommentedTimes(int commentedTimes) {
                    this.commentedTimes = commentedTimes;
                }

                public int getLikedTimes() {
                    return likedTimes;
                }

                public void setLikedTimes(int likedTimes) {
                    this.likedTimes = likedTimes;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BlogQryByPagerItem{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", size=" + size +
                ", startRow=" + startRow +
                ", endRow=" + endRow +
                ", total=" + total +
                ", pages=" + pages +
                ", prePage=" + prePage +
                ", nextPage=" + nextPage +
                ", isFirstPage=" + isFirstPage +
                ", isLastPage=" + isLastPage +
                ", hasPreviousPage=" + hasPreviousPage +
                ", hasNextPage=" + hasNextPage +
                ", navigatePages=" + navigatePages +
                ", navigateFirstPage=" + navigateFirstPage +
                ", navigateLastPage=" + navigateLastPage +
                ", firstPage=" + firstPage +
                ", lastPage=" + lastPage +
                ", list=" + list +
                ", navigatepageNums=" + navigatepageNums +
                '}';
    }
}
