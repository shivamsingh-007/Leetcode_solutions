const addTwoPromises = async (p1: Promise<number>, p2: typeof p1) =>
    (await p1) + (await p2);