package jcpdev.day1.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jcpdev.dto.Member;

@Component
public interface MemberDao {
	@Value("마이바티스")
	public Member findMember(int idx);
}