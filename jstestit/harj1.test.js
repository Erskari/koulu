const sum = require('./harj1');

test ('tarkistaa onko täysi-ikäinen, tulos true', () => {
    expect(sum(18)).toBe(true);
});

test ('tarkistaa onko alaikäinen, tulos false', () => {
    expect(sum(17)).toBe(false);
});

test('Ei yhtään parametriä annettu, heitä poikkeus,', () => {
    expect(() => {sum()}).toThrow('nolla parametriä annettu');
});