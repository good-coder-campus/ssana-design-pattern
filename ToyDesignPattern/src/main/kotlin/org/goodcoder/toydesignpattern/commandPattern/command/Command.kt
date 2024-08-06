package org.goodcoder.toydesignpattern.commandPattern.command

/**
 * 1. 단일 실행 메서드로 커맨드 인터페이스 선언
 * 기초 커맨드 클래스는 모든 구상 커맨드에 대한 공통 인터페이스를 정의
 * 인터페이스 vs 추상클래스
 * 인터페이스: 다중 상속 가능
 * 추상클래스: 기본 구현 공통 메서드 구현 가능, 상태 저장 가능
 */
interface Command {

    fun execute()
}