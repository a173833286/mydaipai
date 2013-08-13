package com.ucclub.aspect.ch01;



public class ForumService {

	@NeedTest(value=true)
	public void deleteForm(int forumid){
		System.out.println("删除版块ID:"+forumid);
	}
	
	
	@NeedTest(value=false)
	public void deleteTopic(int postId){
		System.out.println("删除标题ID："+postId);
	}
}
