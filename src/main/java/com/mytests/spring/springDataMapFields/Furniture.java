/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mytests.spring.springDataMapFields;

import org.springframework.util.Assert;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


@Entity
@Table(name="Furniture")
public class Furniture extends AbstractEntity {

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Integer price;

	@ElementCollection(fetch= FetchType.EAGER)
	private Map<String, String> attributes = new HashMap<String, String>();


	public Furniture(String name, Integer price) {
		this.name = name;
		this.price = price;
	}


	protected Furniture() {
	}


	public void setAttribute(String name, String value) {

		Assert.hasText(name);

		if (value == null) {
			this.attributes.remove(value);
		} else {
			this.attributes.put(name, value);
		}
	}


	public String getName() {
		return name;
	}


	public Map<String, String> getAttributes() {
		return attributes;
	}


	public Integer getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Furniture{" +
				"name='" + name + '\'' +
				", price=" + price +
				", attributes=" + attributes +
				'}';
	}
}
