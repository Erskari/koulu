function taysiika(a) {
    if(a === undefined || a === null){
        throw new Error('nolla parametriä annettu');
    }
    if(a < 18){
        return false;
    } else {
        return true;
    }   
}

module.exports =taysiika;