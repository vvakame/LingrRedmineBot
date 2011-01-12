package net.vvakame.lingr.redmine.service;

import java.util.List;

import net.vvakame.lingr.service.redmine.RedmineService;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

/**
 * {@link RedmineService}のテスト.
 * @author vvakame
 */
public class RedmineServiceTest {

	/**
	 * {@link RedmineService#extractTicketId(String)}のテスト.
	 * @author vvakame
	 */
	@Test
	public void extractTicketId() {
		List<Integer> list = RedmineService.extractTicketId("hoge#1hoge#2hoge");
		assertThat(list.size(), is(2));
		assertThat(list.get(0), is(1));
		assertThat(list.get(1), is(2));
	}
}
