package com.lesstif.jira.issue;

import lombok.Data;

@Data
public class Vote {
	private String self;
	private Integer votes;
	private Boolean hasVoted;
}
