/**
 * 
 */
package com.profectus.filters.commons.web.request;

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
public class EchoRequest {
	private Long echoId;
	private String echoName;
}
