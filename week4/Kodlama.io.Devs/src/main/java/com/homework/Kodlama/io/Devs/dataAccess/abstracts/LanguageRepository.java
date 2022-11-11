package com.homework.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import com.homework.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
}
