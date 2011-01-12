package net.vvakame.lingr.service.redmine;

import java.util.List;

import net.vvakame.lingr.entity.redmine.Slim3Model;
import net.vvakame.lingr.entity.redmine.Slim3ModelMeta;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

public class Slim3Service {

	private Slim3Service() {
	}

	public static Slim3Model newAndPut(String prop1) {
		Slim3Model model = new Slim3Model();
		model.setProp1(prop1);
		Key key = Datastore.put(model);
		model.setKey(key);
		return model;
	}

	public static List<Slim3Model> queryAll() {
		return Datastore.query(Slim3ModelMeta.get()).asList();
	}
}
