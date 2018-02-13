/**
 * 
 */
package com.profectus.filters.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Dell
 *
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "echo")
public class EchoEntity {

	@Id
	@GeneratedValue
	@Column(name = "echo_id")
	private Long echoId;

	@Column(name = "echo_name")
	private String name;
}
