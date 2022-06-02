package br.com.magrinelli.catequese.enumeration;

import lombok.Getter;

@Getter
public enum TypeOfPersonEnum {

	STUDENT("student"), TEACHER("teacher");

	private String value;

	TypeOfPersonEnum(String value) {
		this.value = value;
	}
}
