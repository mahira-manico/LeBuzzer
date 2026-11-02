
export interface Player {
    id: string;
    nickname: string;
    score: number;
}

export interface Question {
    id: string;
    text: string;
    answers: string[];
    timeLimit: number;
}

export interface Game {
    code: string;
    players: Player[];
    currentQuestion: Question | null;
    status: "WAITING" | "PLAYING" | "FINISHED";
}
