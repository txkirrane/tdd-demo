package tdd.data;

import java.util.HashMap;
import java.util.UUID;

import tdd.Model;

public class MapRepository <Type extends Model> implements Repository <UUID, Type>{

    private HashMap<UUID, Type> table = new HashMap<>();

    public MapRepository(HashMap<UUID, Type> table){
        // If a table is given, use it
        this.table = table;
    }

    @Override
    public Type findByID(UUID id) {
        return table.get(id);
    }

    @Override
    public void create(Type obj) {
        if(!table.containsKey(obj.getId())){
            table.put(obj.getId(), obj);
        }
    }

    @Override
    public void update(Type obj) {
        if(table.containsKey(obj.getId())){
            table.put(obj.getId(), obj);
        }
    }

    @Override
    public void delete(Type obj) {
        table.remove(obj.getId());
    }
    
}
