import { create } from "zustand";

const useTodoStore = create((set, get) => ({
    todos : [{
        id : Date.now(),
        text : "밥먹기",
        completed : false,
    },{
        id : Date.now() + 1,
        text : "잠자기",
        completed : false,
    },{
        id : Date.now() + 2,
        text : "숨쉬기",
        completed : false,
    }],

    filter: 'all', //all, active, completed

    toggleTodo : (id) => set(state => ({
        todos : state.todos.map((todo)=> 
            todo.id === id ? {...todo, completed: !todo.completed} : todo
        ) 
    })),

    deleteTodo: (id) => set(state => ({
        todos : state.todos.filter(todo => todo.id !== id)
    })),

    setFilter:(filter) => set({filter}),
    
    getFilteredTodos : () => {
        const {todos, filter} = get();
        switch(filter){
            case "active":
                return todos.filter(todo => !todo.completed);
            case "completed":
                return todos.filter(todo => todo.completed);
            default:
                return todos;
        }
    }
}))

export default useTodoStore;