import React, { useState } from 'react'
import MainContent from './MainContent';

const BlackOrWhite = () => {
    const [theme, setTheme] = useState("white");

    const toggleTheme = () => {
        setTheme(theme === "white" ? "black" : "white");
    }

  return (
    <ThemeContext.provider value={{theme, toggleTheme}}>
        <MainContent />
    </ThemeContext.provider>
    
  )
}

export default BlackOrWhite