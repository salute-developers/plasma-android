import {inflateSync} from "node:zlib";

/**
 * Минимальный декодер PNG (8 бит на канал, без чересстрочности) для проверки скриншотов галереи:
 * достаточно знать, сколько различных цветов в кадре.
 */
export function decodePng(buffer) {
    const signature = buffer.subarray(0, 8).toString("hex");
    if (signature !== "89504e470d0a1a0a") throw new Error("Not a PNG");
    let offset = 8;
    let header;
    const data = [];
    while (offset < buffer.length) {
        const length = buffer.readUInt32BE(offset);
        const type = buffer.toString("ascii", offset + 4, offset + 8);
        const body = buffer.subarray(offset + 8, offset + 8 + length);
        if (type === "IHDR") {
            header = {
                width: body.readUInt32BE(0),
                height: body.readUInt32BE(4),
                depth: body[8],
                colorType: body[9],
                interlace: body[12],
            };
        } else if (type === "IDAT") {
            data.push(body);
        } else if (type === "IEND") {
            break;
        }
        offset += 12 + length;
    }
    if (!header || header.depth !== 8 || header.interlace !== 0) throw new Error("Unsupported PNG");
    const channels = {2: 3, 6: 4}[header.colorType];
    if (!channels) throw new Error(`Unsupported PNG colour type ${header.colorType}`);
    const stride = header.width * channels;
    const raw = inflateSync(Buffer.concat(data));
    const pixels = Buffer.alloc(stride * header.height);
    for (let row = 0; row < header.height; row += 1) {
        const filter = raw[row * (stride + 1)];
        const source = row * (stride + 1) + 1;
        for (let i = 0; i < stride; i += 1) {
            const left = i >= channels ? pixels[row * stride + i - channels] : 0;
            const up = row > 0 ? pixels[(row - 1) * stride + i] : 0;
            const upLeft = row > 0 && i >= channels ? pixels[(row - 1) * stride + i - channels] : 0;
            const value = raw[source + i];
            let predicted = 0;
            if (filter === 1) predicted = left;
            else if (filter === 2) predicted = up;
            else if (filter === 3) predicted = (left + up) >> 1;
            else if (filter === 4) {
                const p = left + up - upLeft;
                const pa = Math.abs(p - left);
                const pb = Math.abs(p - up);
                const pc = Math.abs(p - upLeft);
                predicted = pa <= pb && pa <= pc ? left : pb <= pc ? up : upLeft;
            }
            pixels[row * stride + i] = (value + predicted) & 0xff;
        }
    }
    return {width: header.width, height: header.height, channels, pixels};
}

/** Число различных цветов в кадре и доля пикселей, отличающихся от самого частого цвета (фона). */
export function colourStatistics(image) {
    const counts = new Map();
    for (let i = 0; i < image.pixels.length; i += image.channels) {
        const key = image.pixels.readUIntBE(i, 3);
        counts.set(key, (counts.get(key) || 0) + 1);
    }
    const total = image.width * image.height;
    let background = 0;
    for (const count of counts.values()) background = Math.max(background, count);
    return {colours: counts.size, nonBackgroundShare: (total - background) / total};
}
